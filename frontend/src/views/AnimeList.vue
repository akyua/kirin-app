<template>
    <input type="text" v-model="animeTitle" />
    <button @click="searchAnimes">Search</button>
  
    <ul v-if="searchResults.length > 0">
      <li v-for="anime in searchResults" :key="anime.mal_id">
        {{ anime.title }}
        <img :src="anime.images.jpg.image_url" alt="Anime Image">
      </li>
    </ul>
  
    <p v-else>No anime results found.</p>
  </template>
  
<script>
import AnimeService from '@backend/api/services/animeService';

  export default {
  name: 'AnimeSearch',

  data() {
    return {
      animeTitle: '',
      searchResults: [],
    };
  },

  methods: {
    async searchAnimes() {
      const animeService = new AnimeService(); // Instantiate the AnimeService class with the correct constructor
      try {
        const response = await animeService.searchAnime(this.animeTitle); // Call the searchAnime method on the instance
        if (response.data.data) { // Check if the response contains an array of anime results
          this.searchResults = response.data.data; // Update the searchResults array with the response
          console.log(response.data)
        } else {
          this.searchResults = []; // Clear the searchResults array if no results are found
          console.error('No anime results found.'); // Print an error message
        }
      } catch (error) {
        console.error(error);
      }
    },
 }
};
</script>
  
  <style>
  /* Adicione estilos conforme necessário */
  </style>