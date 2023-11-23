<template>
    <section id="landing">
        <div class="landing-container">
            <div class="landing-header">
                <h2>{{ title }}</h2>
                <a href="season">View All</a>
            </div>
            <div class="landing-cards">
                <Card v-for="(item, index) in items" :key="index" :animeTitle="item.animeTitle" :imageUrl="item.imageUrl"/>
            </div>
            
        </div>
    </section>
</template>

<script>
import Card from '../components/landing/CardComponent.vue';

export default{
    name: "Landing",
    components: { Card },
    props: {
        title: Text,
        items: Array,
    }
}
</script>

<style lang="scss">
#landing{
    background-color: rgb(59, 59, 59);
    padding: 60px 0;
    .landing-container{
        display: flex;
        flex-direction: column;
        justify-content: center;
        width: 1080px;
        margin: 0 auto;
        gap: 20px;
    }
    .landing-cards{
        display: flex;
        justify-content: space-between;
    }
    .landing-header{
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