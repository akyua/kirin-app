<template>
  <li v-for="(anime, index) in animes" :key="animes.id">
    <span class="banner-rank">{{ anime.rank }}</span>
    <div class="banner-name-info">
      <img :src="anime.capa" :alt="anime.nome" width="100" height="150" />
      <strong>{{ anime.nome }}</strong>
    </div>
    <span class="banner-score">{{ anime.score }}</span>
    <span class="banner-episode">{{ anime.episode_type }}</span>
    <span class="banner-status">{{ anime.status }}</span>
  </li>
</template>

<script>
export default {
  data() {
    return {
      animes: [
        {
          id: 1,
          nome: "Nome do Anime 1",
          capa: "https://i.pinimg.com/originals/7a/ff/f1/7afff1deae1a5ec0925e79190ba43a86.jpg",
          rank: 1,
          score: 9.0,
          episode_type: "TV Show (13 episódios)",
          status: "Winter 2021 - Finished",
        },
        {
          id: 2,
          nome: "Nome do Anime 2",
          capa: "link_para_capa2",
          rank: 2,
          score: 8.5,
          episode_type: "Movie (1 hora 40 minutos)",
          status: "Spring 2022 - Ongoing",
        },
        {
          id: 3,
          nome: "Nome do Anime 3",
          capa: "link_para_capa3",
          rank: 3,
          score: 8.2,
          episode_type: "TV Show (24 episódios)",
          status: "Fall 2020 - Finished",
        },
      ],
    };
  },
};
</script>

<style lang="scss" scoped>
li {
  display: grid;
  grid-template-columns: 0.5fr 2fr 0.5fr 1fr 1fr;
  align-items: center;
  color: white;
  border: 2px solid purple;
  padding: 20px;
  margin: 0 auto;
  width: 90%;
  .banner-rank {
    text-align: center;
    font-size: 42px;
    font-weight: 600;
  }
  .banner-name-info {
    img {
      max-height: 150px;
      border-radius: 8px;
      margin-right: 20px;
    }
  }
}
</style>
