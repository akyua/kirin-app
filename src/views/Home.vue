<template>
    <div id="content">
        <Header />
        <main>

        </main>
    </div>
</template>

<script>
import Header from '../components/Header.vue'

export default{
    name: 'Home',
    components: { Header },
}
</script>

<style>
    main{
        height: 90vh;
    }

    #content{
        background-image: url('../assets/wallpaper7.png');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
    }
</style>