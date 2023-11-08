<template>
    <div id="content" ref="content" :style="{ backgroundImage: `url(${currentAnime.image})` }">
        <Header />
        <main>
            <h1>{{  currentAnime.title }}</h1>
            <p>{{ currentAnime.description }}</p>
            <p>Nota: {{ currentAnime.rating }}</p>
        </main>
    </div>
</template>

<script>
import Header from '../components/Header.vue'

export default{
    name: 'Home',
    components: { Header },
    data(){
        return {
            animes: [
                {
                    title: 'Jujutsu Kaisen',
                    image: 'wallpaper.jpg',
                    description: 'jujutsu é um anime bom etc etc etc',
                    rating: 9.0
                },
                {
                    title: 'One Piece',
                    description: 'onepiece etcetc',
                    image: 'wallpaper7.png',
                    rating: 9.2
                },
                {
                    title: 'Hunter x Hunter',
                    description: 'hxh é bom pkrl',
                    image: 'hxh.jpg',
                    rating: 9.8
                }
            ],
            currentIndex: 0
        };
    },
    computed: {
        currentAnime(){
            return this.animes[this.currentIndex]
        }
    },
    created(){
        this.rotateAnime();
    },
    methods: {
        rotateAnime() {
            setInterval(() => {
            this.$refs.content.style.opacity = 0; // Diminui a opacidade
            setTimeout(() => {
                this.currentIndex = (this.currentIndex + 1) % this.animes.length;
                this.$refs.content.style.opacity = 1; // Restaura a opacidade
            }, 1000); // Mude de anime após 1 segundo de transição de opacidade
            }, 10000); // 10 segundos
        }
    }

}
</script>

<style>
    main{
        height: 90vh;
    }

    #content{
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        opacity: 1;
        transition: background-image 1s ease-in-out, opacity 1s ease-in-out;
    }
</style>