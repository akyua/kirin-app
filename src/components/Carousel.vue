<template>
    <div>
        <Header />
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">

                    <img src="@/assets/sousou.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption anime-highlight">
                        <h3 class="season">1 Season</h3>
                        <h2>Sousou no Frieren</h2>
                        <p class="synopsis">The story follows elven mage Frieren, a former member of the party of adventurers who defeated the Demon King and restored harmony to the world after a ten-years-quest.</p>
                        <div class="rating">
                            <img class="icon-star" src="../assets/star.png" alt="icon star">
                            <div>
                                <h3 class="rating-title">Rating</h3>
                                <h3 class="rating-score">9.0/10</h3>
                            </div>
                        </div>
                        <div class="buttons-info">
                            <div class="button-watch">
                                <img src="../assets/play.png" alt="play-icon">
                                <p>Watch Now</p>
                            </div> 
                            <div class="button-add">
                                <img src="../assets/add.png" alt="add-icon">
                                <p>Add to List</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="@/assets/jjk.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption anime-highlight">
                        <h3 class="season">2 Season</h3>
                        <h2>Jujutsu Kaisen</h2>
                        <p class="synopsis">The story follows high school student Yuji Itadori as he joins a secret organization of Jujutsu Sorcerers to eliminate a powerful Curse named Ryomen Sukuna, of whom Yuji becomes the host.</p>
                        <div class="rating">
                            <img class="icon-star" src="../assets/star.png" alt="icon star">
                            <div>
                                <h3 class="rating-title">Rating</h3>
                                <h3 class="rating-score">8.7/10</h3>
                            </div>
                        </div>
                        <div class="buttons-info">
                            <div class="button-watch">
                                <img src="../assets/play.png" alt="play-icon">
                                <p>Watch Now</p>
                            </div> 
                            <div class="button-add">
                                <img src="../assets/add.png" alt="add-icon">
                                <p>Add to List</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="@/assets/aot.jpg" class="image d-block w-100" alt="...">
                    <div class="carousel-caption anime-highlight">
                        <h3 class="season">Final Season</h3>
                        <h2>Attack on Titan</h2>
                        <p class="synopsis">The story follows Eren Yeager, who vows to exterminate the Titans after they bring about the destruction of his hometown and the death of his mother.</p>
                        <div class="rating">
                            <img class="icon-star" src="../assets/star.png" alt="icon star">
                            <div>
                                <h3 class="rating-title">Rating</h3>
                                <h3 class="rating-score">8.6/10</h3>
                            </div>
                        </div>
                        <div class="buttons-info">
                            <div class="button-watch">
                                <img src="../assets/play.png" alt="play-icon">
                                <p>Watch Now</p>
                            </div> 
                            <div class="button-add">
                                <img src="../assets/add.png" alt="add-icon">
                                <p>Add to List</p>
                            </div>
                        </div>
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

<style lang="scss">
.anime-highlight{
    display: flex;
    flex-direction: column;
    height: 100vh;
    justify-content: center;
    align-items: baseline;
    padding: 150px 0 0 0;
    text-align: left;
}

.image {
    object-fit: cover;
    width: 100%;
    height: 100vh;
}

.synopsis{
    max-width: 700px;
    font-size: 22px;
    text-shadow: 2px 2px 4px #000000;
}

.season{
    background-color: rgba(0, 0, 0, 0.158);
    display: inline-block;
    border-radius: 40px;
    border: 2px solid white;
    padding: 9px;
    font-size: 20px;
    font-weight: 600;
}

h2{
    font-weight: 600;
    text-transform: uppercase;
    font-size: 58px;
    text-shadow: 2px 2px 4px #000000;
}

.rating{
    display: flex;
    align-items: center;
    gap: 20px;
    margin-bottom: 10px;
    .icon-star{
        width: 100px;
    }
    .rating-title{
        font-size: 32px;
        text-transform: uppercase;
        font-weight: 600;
        text-shadow: 2px 2px 4px #000000;
    }
    .rating-score{
        font-size: 46px;
        font-weight: 600;
        text-shadow: 2px 2px 4px #000000;
    }
}

.buttons-info{
    display: flex;
    flex-direction: row;
    gap: 40px;
    .button-watch{
        background-color: red;
        display: flex;
        gap: 10px;
        border-radius: 40px;
        padding: 12px;
        font-weight: 600;
        align-items: center;
        img{
            width: 25px;
            height: 25px;
        }
        p{

            font-size: 20px;
            margin-bottom: 0;
        }

    }
    .button-add{
        background-color: rgba(44, 44, 44, 0.795);
        align-items: center;
        font-size: 20px;
        font-weight: 600;
        padding: 12px;
        border-radius: 40px;
        display: flex;
        gap: 10px;
        img{
            width: 25px;
            height: 25px;
        }
        p{
            font-size: 20px;
            margin-bottom: 0;
        }
    }
}
</style>