<template>
    <div>
        <Header />
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">

                    <img src="@/assets/sousou.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h3 class="season">1 Season</h3>
                        <h2>Sousou no Frieren</h2>
                        <p class="synopsis">The story follows elven mage Frieren, a former member of the party of adventurers who defeated the Demon King and restored harmony to the world after a ten-years-quest.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="@/assets/jjk.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h3 class="season">2 Season</h3>
                        <h2>Jujutsu Kaisen</h2>
                        <p class="synopsis">The story follows high school student Yuji Itadori as he joins a secret organization of Jujutsu Sorcerers to eliminate a powerful Curse named Ryomen Sukuna, of whom Yuji becomes the host.</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="@/assets/aot.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption d-none d-md-block">
                        <h3 class="season">Final Season</h3>
                        <h2>Attack on Titan</h2>
                        <p class="synopsis">The story follows Eren Yeager, who vows to exterminate the Titans after they bring about the destruction of his hometown and the death of his mother.</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
</template>

<script>
import Header from '../components/Header.vue';

export default {
    components: { Header }
}
</script>

<style>
.image {
    object-fit: cover;
    width: 100%;
    height: 100vh;
}

.carousel-caption{
    bottom: 17rem;
    text-align: left;
    left: 18%;
}

.synopsis{
    max-width: 700px;
    font-size: 22px;    
}

.season{
    background-color: rgba(0, 0, 0, 0.158);
    display: inline-block;
    border-radius: 20px;
    border: 2px solid white;
    padding: 5px;
    font-size: 20px;
}

h2{
    font-weight: 600;
    text-transform: uppercase;
    font-size: 42px;
}
</style>