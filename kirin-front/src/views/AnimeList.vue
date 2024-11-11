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
        :key="anime.id"
        :animeTitle="anime.title"
        :imageUrl="anime.imageUrl"
      >
        {{ anime.title }}
      </Card>
    </div>
  </main>
</template>

<script>
import Header from "@/components/Header.vue";
import Card from "@/components/landing/CardComponent.vue";

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
      try {
        const response = await fetch(
          "http://localhost:8080/api/animes/search",
          {
            method: "POST",
            headers: {
              "Content-Type": "application/json",
            },
            body: JSON.stringify({ name: this.animeTitle }),
          },
        );

        if (!response.ok) {
          throw new Error("Failed to fetch anime data");
        }

        const animeData = await response.json();

        // Certifique-se de acessar o campo correto
        if (animeData.data && animeData.data.Media) {
          this.searchResults = [
            {
              id: animeData.data.Media.id,
              title:
                animeData.data.Media.title.romaji ||
                animeData.data.Media.title.english ||
                animeData.data.Media.title.native,
              description: animeData.data.Media.description,
              // Você pode adicionar mais campos aqui, como imagem, se necessário
            },
          ];
        } else {
          console.error("A resposta não contém os dados esperados:", animeData);
          this.searchResults = [];
        }
      } catch (error) {
        console.error("Erro ao buscar anime:", error);
        this.searchResults = [];
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
    margin: 50px 0 0 0;
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
