<template>
  <Header />
  <main>
    <div class="container">
      <input
        type="text"
        v-model="animeTitle"
        @input="searchOnInputChange"
        placeholder="Anime name"
      />
      <button @click="searchAnimes">Search</button>
    </div>
    <div class="card-container">
      <Card
        v-for="anime in searchResults"
        :key="anime.mal_id"
        :animeTitle="anime.title"
        :imageUrl="anime.images.jpg.image_url"
      >
        {{ anime.title }}
      </Card>
    </div>
  </main>
</template>

<script>
import Header from "@/components/Header.vue";
import Card from "@/components/landing/CardComponent.vue";
import AnimeService from "@backend/api/services/animeService";

export default {
  name: "AnimeSearch",
  components: { Header, Card },

  data() {
    return {
      animeTitle: "",
      searchResults: [],
    };
  },

  methods: {
    async searchOnInputChange() {
      setTimeout(() => {
        this.searchAnimes();
      }, 500);
    },
    async searchAnimes() {
      const animeService = new AnimeService(); // Instantiate the AnimeService class with the correct constructor
      try {
        const response = await animeService.searchAnime(this.animeTitle); // Call the searchAnime method on the instance
        if (response.data.data) {
          // Check if the response contains an array of anime results
          this.searchResults = response.data.data; // Update the searchResults array with the response
          console.log(response.data);
        } else {
          this.searchResults = []; // Clear the searchResults array if no results are found
          console.error("No anime results found."); // Print an error message
        }
      } catch (error) {
        console.error(error);
      }
    },
  },
};
</script>

<style lang="scss" scoped>
main {
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: rgb(31, 31, 31);
  min-height: 100vh;
  .container {
    margin: 200px 0 0 0;
    display: flex;
    justify-content: center;
    gap: 10px;
    input {
      border-radius: 5px;
      background-color: rgb(15, 18, 21);
      color: white;
      border: none;
      font-size: 16px;
      padding: 10px;
      &:focus {
        outline: 0;
      }
    }
    button {
      border-radius: 5px;
      background-color: rgb(168, 26, 250);
      color: white;
      border: black;
      padding: 10px;
      transition: 0.3s ease-in-out;
      &:hover {
        background-color: rgb(136, 23, 201);
      }
    }
  }
  .card-container {
    padding-top: 100px;
    display: flex;
    justify-content: center;
    width: 1080px;
    gap: 20px;
    flex-wrap: wrap;
    margin: 0 auto;
  }
}
</style>

