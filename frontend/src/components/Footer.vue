<template>
  <footer>
    <div class="footer-container">
      <p class="rights">
        Anime Kirin is a property of
        <a href="https://www.linkedin.com/in/gabriel-hs/">Gabriel Silveira</a>
        © 2023 All Rights Reserved.
      </p>
    </div>
  </footer>
</template>

<script>
export default {};
</script>

<style lang="scss" scoped>
footer {
  width: 100%;
  background-color: rgb(16 16 16);
  padding: 20px 0;
  .footer-container {
    display: flex;
    align-items: center;
    justify-content: center;
    margin: 0 auto;
    flex-wrap: wrap;
    text-align: center;
    .rights {
      color: white;
      margin: 0px;
      a {
        color: $primary-color;
        text-decoration: none;
        transition: 0.3s;
      }
      a:hover {
        color: gray;
      }
    }
  }
}
</style>

