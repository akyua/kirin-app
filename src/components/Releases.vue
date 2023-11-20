<template>
    <section id="releases">
        <div class="release-container">
            <div class="releases-header">
                <h2>Animes Releases</h2>
                <a href="season">View All</a>
            </div>
            <div class="releases-cards">
                <Card animeTitle="Spy x Family Season 2" imageUrl="@fs/src/assets/spyxfamily.jpg"/>
                <Card animeTitle="Sousou no Frieren" imageUrl="https://i.pinimg.com/originals/86/b9/8e/86b98e631a28207ad97fed1d09382817.jpg"/>
                <Card animeTitle="Kage no Jitsuryokusha ni Naritakute! 2nd season" imageUrl="https://i.pinimg.com/originals/a0/92/02/a092028da07f91f7f1d9f96361423f81.jpg"/>
                <Card animeTitle="Dr. STONE: NEW WORLD Part 2" imageUrl="https://i.pinimg.com/originals/15/41/0f/15410f02629eb449679013cb7fb34baf.jpg"/>
            </div>
            
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
    padding: 60px 0;
    .release-container{
        display: flex;
        flex-direction: column;
        justify-content: center;
        width: 1080px;
        margin: 0 auto;
        gap: 20px;
    }
    .releases-cards{
        display: flex;
        justify-content: space-between;
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