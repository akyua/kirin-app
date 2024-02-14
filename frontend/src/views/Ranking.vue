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
      <GridBanner />
    </section>
  </main>
</template>

<script>
import Header from "../components/Header.vue";
import GridBanner from "../components/GridBanner.vue";
export default {
  components: {
    Header,
    GridBanner,
  },
};
</script>

<style lang="scss">
main {
  display: flex;
  flex-direction: column;
  gap: 25px;
  background-color: $background-color;
  padding-top: 25px;
  min-height: 100vh;
}
#filter {
  display: flex;
  justify-content: space-between;
  width: 90%;
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
  ul {
    padding: 0;
  }
}
</style>
