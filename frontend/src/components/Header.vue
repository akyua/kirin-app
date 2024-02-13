<template>
  <header
    :class="{
      'main-page-header': isMainPage,
      'other-page-header': !isMainPage,
    }"
  >
    <nav id="logo">
      <router-link to="/">
        <img src="/kirin_white.png" alt="logo kirin" />
      </router-link>
    </nav>
    <nav class="topics">
      <ul class="menu">
        <li>
          <router-link class="menu-hover" to="/anime-list">Animes</router-link>
        </li>
        <li>
          <router-link class="menu-hover" to="/ranking">Ranking</router-link>
        </li>
        <li><router-link class="menu-hover" to="#">Reviews</router-link></li>
        <li><router-link class="menu-hover" to="/about">About</router-link></li>
        <li>
          <router-link class="login" to="/login">
            <div id="user-icon">
              <img src="../assets/user.png" alt="user" class="user-icon" />
            </div>
          </router-link>
        </li>
      </ul>
    </nav>
  </header>
</template>

<script>
export default {
  props: {
    isMainPage: {
      type: Boolean,
      default: false,
    },
  },
};
</script>

<style scoped lang="scss">
.main-page-header {
  position: absolute;
  width: 100%;
  z-index: 2; /* Certifique-se de que o cabeçalho esteja sobre o carrossel */
  padding-top: 20px;
  box-shadow: inset 0px 20px 10px -10px rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: space-evenly;
  align-items: center;
}

.other-page-header {
  display: flex;
  justify-content: space-evenly;
  box-shadow: inset 0px 20px 10px -10px rgba(0, 0, 0, 0.5);
  align-items: center;
  padding-top: 20px;
  background-color: rgb(31, 31, 31);
}

#logo {
  margin-bottom: 16px;
}

#logo a img {
  width: 100px;
}

.topics,
.menu,
#logo {
  display: flex;
  justify-content: center;
  align-items: center;
}

.topics ul {
  display: flex;
  gap: 40px;
  list-style-type: none;
}

.topics ul li a {
  text-decoration: none;
  font-size: $font-topics;
  color: rgb(255, 255, 255);
  font-weight: 600;
  text-shadow: 3px 3px 5px rgba(0, 0, 0, 0.8);
}

.menu a {
  text-decoration: none;
  position: relative;
  overflow: hidden;
  margin-bottom: 10px;
}

.menu a span {
  position: relative;
  display: inline-block;
}

.menu .menu-hover::before {
  content: "";
  position: absolute;
  bottom: -3px;
  left: 50%;
  transform: translateX(-50%);
  width: 0;
  height: 4px;
  background-color: $primary-color; /* Cor da barra de destaque */
  border-radius: 20px;
  transition: width 0.4s; /* Duração da animação de crescimento */
}

.menu a:hover::before {
  width: 100%; /* A barra crescerá até 100% da largura do link */
}

.user-icon {
  width: 60px;
  height: 60px;
  display: flex;
  border-radius: 60%;
  box-shadow: 3px 3px 5px rgba(0, 0, 0, 0.8);
}
</style>
