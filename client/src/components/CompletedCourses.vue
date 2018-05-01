<template>
  <div id="service" class="section md-padding" style="min-nheight: 110vh">
    <div class="container margins">
      <div>
        <div class="section-header text-center" style="margin-bottom: 10vh">
          <h2 class="title" style="margin-top: 15vh">{{completedCourses}}</h2>
        </div>
        <div id="app">
            <div class="row" v-for="i in rowCount" style="margin-top: 15vh" v-bind:key='i'>
             <span class="col-md-4 col-sm-6" v-for="item in itemCountInRow(i)" v-bind:key="item.course">
                <h3 class="text-center">{{item.course}}</h3>
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
      listOfCompletedCourses: [],
      completedCourses: ''
    }
  },
  created: function () {
    axios.get('/completed/' + this.language).then(response => {
      this.listOfCompletedCourses = response.data
    })
    axios.get('/titles/' + this.language).then(response => {
      this.completedCourses = response.data.completedCourses
    })
  },
  computed: {
    rowCount: function () {
      return Math.ceil(this.listOfCompletedCourses.length / this.itemsPerRow)
    },
    language: function () {
      return this.$store.state.language
    }
  },

  watch: {
    language () {
      axios.get('/completed/' + this.language).then(response => {
        this.listOfCompletedCourses = response.data
      })
      axios.get('/titles/' + this.language).then(response => {
        this.completedCourses = response.data.completedCourses
      })
    }
  },
  methods: {
    itemCountInRow: function (index) {
      return this.listOfCompletedCourses.slice((index - 1) * this.itemsPerRow, index * this.itemsPerRow)
    }
  }
}
</script>
<style scoped>
  .section {
    height: 100%;
    position: relative;
    padding-top: 150px;
    left: 0;
    top: 0;
    right: 0;
    bottom: 0;
    background: rgba(20, 20, 20, 0.94);
    background-image: url("https://images.unsplash.com/photo-1508704019882-f9cf40e475b4?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=8c6e5e3aba713b17aa1fe71ab4f0ae5b&auto=format&fit=crop&w=1352&q=80");
    z-index: -1;
    background-repeat:no-repeat;
    -webkit-background-size:cover;
    -moz-background-size:cover;
    -o-background-size:cover;
    background-size:cover;
    background-position:center;
    -webkit-clip-path: polygon(70% 0, 100% 10%, 100% 100%, 0 100%, 0 10%, 30% 0);
    clip-path: polygon(70% 0, 100% 10%, 100% 100%, 0 100%, 0 10%, 30% 0);
  }
  .row {
    margin-bottom: 0;
  }

</style>
