<template>
  <!-- About -->
  <div id="about" class="section md-padding">

    <!-- Container -->
    <div class="container">

      <!-- Row -->

        <!-- Section header -->
        <div class="section-header text-center">
          <h2 class="title">{{title}}</h2>
        </div>
        <!-- /Section header -->
        <div class="row">
          <div class="about" v-for="element in hobbies" v-bind:key="element.hobbie">
            <h3 class="text-center"> {{element.hobbie}}</h3>
            <!--<a href="#">Usser</a>-->
          </div>
        </div>
    </div>
  </div>
</template>

<script>
import About from './About.vue'
import UsedTech from './UsedTechnologies'
import {axios} from './../router/http-common'

export default {
  components: {UsedTech, About},
  name: 'hobbies',
  data: function () {
    return {
      itemsPerRow: 3,
      hobbies: [],
      title: ''
    }
  },
  computed: {
    rowCount: function () {
      return Math.ceil(this.hobbies.length / this.itemsPerRow)
    },
    language: function () {
      return this.$store.state.language
    }
  },
  methods: {
    itemCountInRow: function (index) {
      return this.hobbies.slice((index - 1) * this.itemsPerRow, index * this.itemsPerRow)
    }
  },
  watch: {
    language () {
      axios.get('/hobbies/' + this.language).then(response => {
        this.hobbies = response.data
      })
      axios.get('/titles/' + this.language).then(response => {
        this.title = response.data.hobbies
      })
    }
  },
  created: function () {
    axios.get('/hobbies/' + this.language).then(response => {
      this.hobbies = response.data
    })
    axios.get('/titles/' + this.language).then(response => {
      this.title = response.data.hobbies
    })
  }

}
</script>
<style scoped>
  h1, h2, h4 {
    color: wheat;
  }
  .md-padding {
    padding-top: 120px;
    padding-bottom: 0;
  }
</style>
