<template>
  <ul class="grid-banner">
    <BannerComponent />
  </ul>
</template>
<script>
import BannerComponent from "./landing/BannerComponent.vue";
export default {
  components: {
    BannerComponent,
  },
};
</script>

<style lang="scss" scoped>
.grid-banner {
  display: flex;
  flex-direction: column;
  gap: 10px;
}
</style>
