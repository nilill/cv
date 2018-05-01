<template>
  <div>
    <div id="app">
      <div></div>
      <navigation/>
      <div ></div>
      <router-view class="bg-img"/>
    </div>
  </div>
</template>

<script>
import Navigation from './components/Navbar'

export default {
  components: {Navigation},
  name: 'App',
  data: function () {
    return {
      coordinate: 0
    }
  }
}

</script>
<style>
</style>
