<template>
  <Carousel />
  
</template>

<script>
import Carousel from '../components/Carousel.vue';

export default {
  name: 'Home',
  components: { Carousel}
}
</script>

<style>
.Header{
  z-index: 2;
}

.Carousel{
  z-index: 1;
}

</style>