<template>
  <!-- About -->
  <div id="about" class="section md-padding">

        <div class="section-header text-center margins">
          <h2 class="title">{{title}}</h2>
        </div>
        <div class="row margins">
          <div class="about" v-for="element in courses" v-bind:key="element.course" style="align-self: center">
            <i class="fa fa-mobile"></i>
            <h3 class="text-center"> {{element.course}}</h3>
          </div>
        </div>
  </div>

</template>

<script>
import {axios} from './../router/http-common'
export default {
  name: 'ongoingCourses',
  data () {
    return {
      courses: [],
      title: ''
    }
  },
  created: function () {
    axios.get('/ongoing/' + this.language).then(response => {
      this.courses = response.data
    })
    axios.get('/titles/' + this.language).then(response => {
      this.title = response.data.ongoingCourses
    })
  },
  computed: {
    language: function () {
      return this.$store.state.language
    }
  },
  watch: {
    language () {
      axios.get('/ongoing/' + this.language).then(response => {
        this.courses = response.data
      }); axios.get('/titles/' + this.language).then(response => {
        this.title = response.data.ongoingCourses
      })
    }
  }
}
</script>

<style scoped>
  h1, h2, h4 {
    color: wheat;
  }
  .row {
    margin-bottom: 0;
  }
</style>
