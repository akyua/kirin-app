<template>
    <div class="card" @mouseover="showInfo" @mouseout="hideInfo">
        <a :href="cardLink" class="card-link">
            <img :src="imageUrl" alt="anime-banner">
            <p class="card-title">{{ animeTitle }}</p>
        </a>
        <transition name="fade">
            <div class="info" v-show="infoVisible">
                <p>{{ animeTitle }}</p>
            </div>
        </transition>
    </div>
</template>

<script>
export default{
    props: {
        animeTitle: String,
        imageUrl: String,
    },
    data(){
        return{
            infoVisible: false,
        }
    },
    methods: {
        showInfo(){
            this.infoVisible = true;
        },
        hideInfo(){
            this.infoVisible = false;
        }
    },
    computed: {
        cardLink(){
            return `/anime/${this.animeTitle.toLowerCase().replace(/\s+/g, '-')}`;
        }
    }

}
</script>

<style lang="scss">
    .card{
        width: 250px;
        background-color: inherit;
        border: none;
        
        .card-link{
            text-decoration: none;
            img{
                width: 100%;
                height: auto;
                height: 350px;
                object-fit: cover;
            }
            p{
                color: white;
                transition: 0.3s ease-in-out;
            }
        }
        &:hover {
            display: block;
            .card-title {
                color: red; // Adicione esta linha para alterar a cor do texto para vermelho
            }
        }

        .info{
            position: absolute;
            top: 0;
            left: 100%;
            width: 200px;
            height: 100px;
            background-color: #2c2c2c;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 10px;
            z-index: 2;
            margin: 20px 0 0 20px;
            color: white;
            border-radius: 15px;
            h3{
                margin-bottom: 5px;
            }
            &::before {
                content: "";
                position: absolute;
                top: 30%;
                left: -10%;
                margin-top: -10px;
                border-width: 10px;
                border-style: solid;
                border-color: transparent #2c2c2c transparent transparent;
            }
            &.fade-enter-active,
            &.fade-leave-active {
                transition: opacity 0.4s;
            }
            &.fade-enter, &.fade-leave-to {
            opacity: 0;
        }
        }

        &:hover .info{
            display: block;
        }
    }
</style>