<template>
  <section id="landing">
    <div class="landing-container">
      <div class="landing-header">
        <h2>{{ title }}</h2>
        <a href="anime-list">View All</a>
      </div>
      <div class="landing-cards">
        <Card
          v-for="(item, index) in items"
          :key="index"
          :animeTitle="item.animeTitle"
          :imageUrl="item.imageUrl"
        />
      </div>
    </div>
  </section>
</template>

<script>
import Card from "../components/landing/CardComponent.vue";

export default {
  name: "Landing",
  components: { Card },
  props: {
    title: {
      type: String,
      required: true,
    },
    items: {
      type: Array,
      required: true,
    },
  },
};
</script>

<style lang="scss" scoped>
#landing {
  .landing-container {
    display: flex;
    flex-direction: column;
    justify-content: center;
    width: 1080px;
    margin: 0 auto;
    gap: 20px;
  }
  .landing-cards {
    display: flex;
    justify-content: space-between;
    flex-wrap: wrap;
  }
  .landing-header {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    flex-wrap: wrap;
    h2 {
      font-size: 22px;
      font-weight: 400;
      text-shadow: none;
      color: white;
    }
    a {
      text-decoration: none;
      color: white;
    }
  }
}

@media only screen and (max-width: 1180px) {
  #landing {
    .landing-container {
      width: 580px;
      margin: 0 auto;
    }
    .landing-cards {
      gap: 40px;
    }
  }
}

@media only screen and (max-width: 640px) {
  #landing {
    .landing-container {
      width: 220px;
      margin: 0 auto;
    }
    .landing-cards {
      gap: 40px;
    }
  }
}
</style>
