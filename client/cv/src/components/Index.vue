<template>
  <div>
    <about class="fixed-bg fixed-bg--1"/>
    <ongoing-courses id="studying" class="scrolling-bg cd-scrolling-bg--color-2"/>
    <used-tech id="usedTech" class="fixed-bg fixed-bg--4"/>
    <hobbies id="hobbies" class="scrolling-bg cd-scrolling-bg--color-2"/>
    <after-word id="contact" class="fixed-bg fixed-bg--3"/>
  </div>
</template>

<script>
import About from './About.vue'
import UsedTech from './UsedTechnologies'
import OngoingCourses from './OngoingCourses'
import CompletedCourses from './CompletedCourses'
import Hobbies from './Hobbies'
import AfterWord from './AfterWord'
export default {
  components: {UsedTech, About, OngoingCourses, CompletedCourses, Hobbies, AfterWord},
  name: 'Index',
  data: function () {
    return {
    }
  },

  methods: {

    setLanguage (language) {
      this.$store.dispatch('setLanguage', language)
    },
    goToEnglishCV () {
      this.$router.replace({path: '/about'})
    },
    goToEstonianCV () {
      this.$router.replace({path: '/about'})
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .scrolling-bg.cd-scrolling-bg--color-2 {
    background-color: #3d3536;
    color: #a6989a;
  }

</style>
