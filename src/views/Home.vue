<template>
  <Carousel class="carousel">
    <Header />
    <Slide v-for="(slide, index) in carouselSlides" :key="index">
      <div class="slide-info">
        <img :src="getFile(slide)" alt="">
      </div>
    </Slide>
  </Carousel>
</template>
  
  <script>
  import Header from '../components/Header.vue';
  import Carousel from '../components/Carousel.vue';
  import Slide from '../components/Slide.vue';
  
  export default {
    name: 'Home',
    components: { Header, Carousel, Slide },
    setup() {
      const carouselSlides = ["hxh", "onepiece", "jjk"];

      return { carouselSlides };
    },
    data() {
      return {
        animes: [
          {
            title: 'Jujutsu Kaisen',
            image: 'wallpaper.jpg',
            description: 'jujutsu é um anime bom etc etc etc',
            rating: 9.0
          },
          {
            title: 'One Piece',
            description: 'one piece etc etc',
            image: 'wallpaper7.png',
            rating: 9.2
          },
          {
            title: 'Hunter x Hunter',
            description: 'hxh é bom pra caramba',
            image: 'hxh.jpg',
            rating: 9.8
          }
        ],
      };
    },
    methods: {
      getFile(file){
        return `${file}.jpg`;
      }
    }
  }
  </script>
  
  <style lang="scss" scoped>
    .carousel{
      position: relative;
      max-height: 100vh;
      height: 100vh;
    
      .slide-info{
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        max-height: 100%;
        height: 100%;

        img {
          min-width: 100%;
          height: 100%;
          object-fit: cover;
        }
      }
      & > Header {
        position: relative;
        z-index: 2;
      }
    }
  </style>
  