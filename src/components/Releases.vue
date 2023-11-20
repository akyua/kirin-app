<template>
    <section id="releases">
        <div class="release-container">
            <div class="releases-header">
                <h2>Animes Releases</h2>
                <a href="season">View All</a>
            </div>
            <Card />
        </div>
    </section>
</template>

<script>
import Card from '../components/releases/Card.vue';

export default{
    name: "Releases",
    components: { Card },
}
</script>

<style lang="scss">
#releases{
    background-color: rgb(99, 98, 98);
    .release-container{
        display: flex;
        flex-direction: column;
        justify-content: center;
        width: 1080px;
        margin: 0 auto;
        
    }
    .releases-header{
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        h2{
            font-size: 22px;
            font-weight: 400;
            text-shadow: none;
        }
        a{
            text-decoration: none;
            color: white;
        }
    }

}
</style>