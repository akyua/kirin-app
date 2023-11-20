<template>
    <div class="card">
        <a :href="cardLink" class="card-link">
            <img :src="imageUrl" alt="anime-banner">
            <p>{{ animeTitle }}</p>
        </a>
    </div>
</template>

<script>
export default{
    props: {
        animeTitle: String,
        imageUrl: String,
    },
    computed: {
        cardLink(){
            return `/anime/${this.animeTitle.toLowerCase().replace(/\s+/g, '-')}`;
        }
    }

}
</script>

<style lang="scss">
    .card{
        width: 250px;
        background-color: inherit;
        border: none;
        .card-link{
            text-decoration: none;
            img{
                width: 100%;
                height: auto;
                height: 350px;
            }
            p{
                color: white;
            }
        }
       
    }
</style>