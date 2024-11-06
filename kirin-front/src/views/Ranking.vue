<template>
  <Header />
  <main>
    <section id="filter">
      <div>
        <h3>Search</h3>
        <input type="text" />
      </div>
      <div>
        <h3>Genre</h3>
        <select></select>
      </div>
      <div>
        <h3>Year</h3>
        <select></select>
      </div>
      <div>
        <h3>Season</h3>
        <select></select>
      </div>
      <div>
        <h3>Format</h3>
        <select></select>
      </div>
      <div>
        <h3>Airing Status</h3>
        <select></select>
      </div>
    </section>
    <section id="ranking">
      <h2>Ranking</h2>
      <ul>
        <BannerComponent />
      </ul>
    </section>
  </main>
</template>

<script>
import Header from "../components/Header.vue";
import BannerComponent from "../components/landing/BannerComponent.vue";
export default {
  components: {
    Header,
    BannerComponent,
  },
};
</script>

<style lang="scss">
main {
  background-color: $background-color;
}
#filter {
  display: flex;
  justify-content: space-evenly;
  max-width: 95%;
  margin: 0 auto;
  div {
    width: 10%;
    h3 {
      color: white;
      font-size: 14px;
      font-weight: 600;
    }
    input,
    select {
      border: none;
      border-radius: 5px;
      background-color: rgb(15, 18, 21);
      max-width: 100%;
      color: white;
      padding: 11px 16px;
      font-size: 14px;
      font-weight: 600;
      letter-spacing: 0.03rem;
    }
    select {
      max-width: 100%;
      width: 100%;
    }
  }
}

#ranking {
  display: flex;
  flex-direction: column;
  margin: 0 auto;
  h2 {
    display: flex;
    margin: 0 auto;
    width: 90%;
    text-align: center;
    color: white;
  }
  ul {
    padding: 0;
  }
}
</style>
