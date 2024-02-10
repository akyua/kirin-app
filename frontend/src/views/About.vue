<template>
  <Header :isMainPage="true" />
  <main>
    <section>
      <div class="main-container">
        <h2>Anime Kirin</h2>
        <h3>
          modern website dedicated to anime reviews, listings and community
          engagement.
        </h3>
      </div>
    </section>
  </main>
</template>

<script>
import Header from "../components/Header.vue";

export default {
  components: {
    Header,
  },
};
</script>

<style lang="scss" scoped>
main {
  display: flex;
  background-color: rgb(31, 31, 31);
  min-height: 100vh;
}

/* section {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background-color: rgb(38, 38, 38);
  padding: 20px;
  border: 5px solid purple;
  border-radius: 20px;
  color: white;
  width: 70%;
  height: fit-content;
  margin: 60px auto;
} */

section {
  object-fit: cover;
  width: 100%;
  height: 100vh;
  background-image: url("@/assets/background.jpg");
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
}

.main-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: start;
  text-align: left;
  height: 100vh;
  color: white;
  margin: 0 0 0 15%;
}

h3 {
  max-width: 680px;
  font-size: 36px;
  text-transform: uppercase;
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
}

h2 {
  text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.8);
  text-transform: uppercase;
  font-weight: 600;
  font-size: 52px;
}
</style>
