<template>
    <h1>Animes</h1>
  
    <table>
      <thead>
        <tr>
          <th>Nome</th>
          <th>Episódios</th>
          <th>Status</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="anime in animes" :key="anime.mal_id">
          <td>{{ anime.title }}</td>
          <td>{{ anime.episodes }}</td>
          <td>{{ anime.status }}</td>
        </tr>
      </tbody>
    </table>
  </template>
  
<script>
  import axios from 'axios';

  export default {
  name: 'AnimeList',

  data() {
    return {
      animes: [],
    };
  },
  methods: {
      async getAnimes() {
        const response = await axios.get('https://api.jikan.moe/v4/anime');
        console.log(response.data);
        this.animes = response.data.data;
      },
  },

  mounted() {
    this.getAnimes();
  },
};
</script>
  
  <style>
  /* Adicione estilos conforme necessário */
  </style>