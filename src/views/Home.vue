<template>
  <Carousel />
  <Releases />
</template>

<script>
import Carousel from '../components/Carousel.vue';
import Releases from '../components/Releases.vue';

export default {
  name: 'Home',
  components: { Carousel, Releases}
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