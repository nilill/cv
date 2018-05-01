<template>
  <div id="service" class="section md-padding">
    <div class="container margins">
      <div class="row">
        <div class="section-header text-center">
          <h2 style="margin-bottom: 100px" class="cursive title">{{title}}</h2>
        </div>
        <div id="app">
          <div class="row" v-for="i in rowCount" v-bind:key='i'>
             <span class="col-md-4 col-sm-6" v-for="item in itemCountInRow(i)" v-bind:key='item.skill'>
                <h3 class="text-center">{{item.skill}}</h3>
                <p class="text-center">{{item.description}}</p>
            </span>
          </div>
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
  name: 'completedCourses',
  data: function () {
    return {
      itemsPerRow: 3,
      usedTech: [],
      title: ''
    }
  },
  computed: {
    rowCount: function () {
      return Math.ceil(this.usedTech.length / this.itemsPerRow)
    },
    language: function () {
      return this.$store.state.language
    }
  },
  created: function () {
    axios.get('/usedTech/' + this.language).then(response => {
      this.usedTech = response.data
    })
    axios.get('/titles/' + this.language).then(response => {
      this.title = response.data.techIHaveUsed
    })
  },
  methods: {
    itemCountInRow: function (index) {
      return this.usedTech.slice((index - 1) * this.itemsPerRow, index * this.itemsPerRow)
    }
  },
  watch: {
    language () {
      axios.get('/usedTech/' + this.language).then(response => {
        this.usedTech = response.data
      })
      axios.get('/titles/' + this.language).then(response => {
        this.title = response.data.techIHaveUsed
      })
    }
  }}
</script>
<style scoped>
</style>
