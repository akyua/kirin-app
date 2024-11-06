<template>
    <div v-if="visible" class="notification">
      <p class="notification-text">{{ message }}</p>
    </div>
  </template>
  
  <script>
  export default {
    name: "Notification",
    props: {
      message: {
        type: String,
        required: true
      },
      duration: {
        type: Number,
        default: 1000 
      }
    },
    data() {
      return {
        visible: true
      };
    },
    mounted() {
      setTimeout(() => {
        this.visible = false;
      }, this.duration);
    }
  };
  </script>
  
  <style scoped>
  .notification {
    position: fixed;
    bottom: 20px; 
    right: 20px;
    background-color: #4caf50;
    color: white;
    padding: 15px;
    border-radius: 5px;
    box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
    font-weight: bold;
    display: flex; 
    justify-content: center; 
    align-items: center; 
  }
  .notification-text{
    text-align: center;
    margin: 0;
  }
  </style>