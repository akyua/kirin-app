<template>
  <Header />
  <main>
    <section>
      <h1>Who are we?</h1>
      <h3>
        We are a modern Anime Review/List Platform, committed to offering a
        holistic space for anime enthusiasts to delve into, critique, and
        converse about their beloved shows and movies. Being passionate fans
        ourselves, we deeply grasp the significance of community-powered
        platforms where users can exchange insights, recommendations, and
        critiques with fellow anime aficionados.
      </h3>
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

section {
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
}
</style>
