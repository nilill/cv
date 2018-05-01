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
  #app {
    /*background-image: url("http://kubon.heteml.jp/img/pict-top2.png");*/
    /*height: 100%;*/
    /*background-position: center;*/
    /*background-repeat: no-repeat;*/
    /*background-size: cover;*/
  }
  .secondBG {
    position: fixed;
    padding-top: 0;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: rgba(20, 20, 20, 0.94);
    background-image: url("http://kubon.heteml.jp/img/pict-top4.png");
    z-index: +1;
    background-repeat:no-repeat;
    -webkit-background-size:cover;
    -moz-background-size:cover;
    -o-background-size:cover;
    background-size:cover;
    background-position:center;
  }
</style>
