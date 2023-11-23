<template>
  <Carousel />
  <LandingComponent :title="animeRelease" :items="animeReleaseItems"/>
  <LandingComponent :title="animeUpcoming" :items="animeUpcomingItems"/>
  <LandingComponent :title="animeAllTime" :items="animeAllTimeItems"/>
  <AllTime />
  <Suggestions />
  <Footer />
</template>

<script>
import Carousel from '../components/Carousel.vue';
import LandingComponent from '../components/LandingComponent.vue';

export default {
  name: 'Home',
  components: { Carousel, LandingComponent },
  data(){
    return{
      animeRelease: "Animes Releases",
      animeUpcoming: "Animes Upcoming",
      animeAllTime: "Animes All Time Popular",
      animeReleaseItems: [
        {animeTitle: 'Spy x Family Season 2', imageUrl: "src/assets/spyxfamily.jpg"},
        {animeTitle: 'Sousou no Frieren"', imageUrl: "https://i.pinimg.com/originals/86/b9/8e/86b98e631a28207ad97fed1d09382817.jpg"},
        {animeTitle: 'Kage no Jitsuryokusha ni Naritakute! 2nd season', imageUrl: "https://i.pinimg.com/originals/a0/92/02/a092028da07f91f7f1d9f96361423f81.jpg"},
        {animeTitle: 'Dr. STONE: NEW WORLD Part 2"', imageUrl: "https://i.pinimg.com/originals/15/41/0f/15410f02629eb449679013cb7fb34baf.jpg"},
      ],
      animeUpcomingItems: [
        {animeTitle: 'Solo Leveling', imageUrl: "https://i.pinimg.com/originals/9f/dc/be/9fdcbe10122eb360c1c73a57e69b2090.jpg"},
        {animeTitle: 'Kono Subarashii Sekai ni Shukufuku wo! 3', imageUrl: "https://i.pinimg.com/originals/fb/90/b1/fb90b1dc08292137d28e01bd664f2beb.jpg"},
        {animeTitle: 'Ao no Exorcist: Shimane Illuminati-hen', imageUrl: "https://i.pinimg.com/originals/27/36/4c/27364cdee89331ae8d14adaf39e75644.jpg"},
        {animeTitle: 'Haikyuu!!: Gomi Suteba no Kessen', imageUrl: "src/assets/haikyuu.jpg"},
      ],
      animeAllTimeItems:[
        {animeTitle: 'One Piece', imageUrl: "https://i.pinimg.com/originals/92/ac/23/92ac23c9990cbea4a8f30ae623b97dc4.jpg"},
        {animeTitle: 'Hunter x Hunter', imageUrl: "https://i.pinimg.com/564x/b9/ef/0a/b9ef0ae3b860fd287e907491fddd560c.jpg"},
        {animeTitle: 'Attack on Titan', imageUrl: "https://i.pinimg.com/originals/7a/ff/f1/7afff1deae1a5ec0925e79190ba43a86.jpg"},
        {animeTitle: 'Death Note', imageUrl: "https://i.pinimg.com/564x/48/6c/92/486c9256c1774be99defb08a3181d86b.jpg"},
        
      ]

    }
  }
}
</script>

<style>
.Header{
  z-index: 2;
}

.Carousel{
  z-index: 1;
}

</style>