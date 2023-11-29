<template>
    <header>
        <nav id="logo">
            <a href="/">
                <img src="/kirin_white.png" alt="logo kirin">
            </a>
        </nav>
        <nav class="topics">
            <ul class="menu">
                <li><a class="menu-hover" href="/anime-list">Animes</a></li>
                <li><a class="menu-hover" href="#">Ranking</a></li>
                <li><a class="menu-hover" href="#">Reviews</a></li>
                <li><a class="menu-hover" href="#">About</a></li>
                <li>
                    <a class="login" href="/login">
                        <div id="user-icon">
                            <img src="../assets/user.png" alt="user" class="user-icon">
                        </div>
                    </a>
                </li>
            </ul>
        </nav>
    </header>
</template>

<script>
export default{

}
</script>

<style scoped lang="scss">
@import '../variables/variables.scss';

header {
  position: absolute;
  width: 100%;
  z-index: 2; /* Certifique-se de que o cabeçalho esteja sobre o carrossel */
  padding-top: 20px;
  box-shadow: inset 0px 20px 10px -10px rgba(0, 0, 0, 0.5);
  display: flex;
  justify-content: space-evenly;
  align-items: center;
}

#logo{
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
  background-color: red; /* Cor da barra de destaque */
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
}
</style>