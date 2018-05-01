<template>
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <vue-up></vue-up>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
        <ul class="nav navbar-nav">

          <li v-if="language==='et'" class="active"  v-smooth-scroll><a href="#">Pealeht</a></li>
          <li v-if="language==='et'"><a href="#completedCourses" v-smooth-scroll>Läbitud kursused</a></li>
          <li v-if="language==='et'"><a href="#studying" v-smooth-scroll>Mida hetkel õpin</a></li>
          <li v-if="language==='et'"><a href="#usedTech" v-smooth-scroll>Kasutatud tehnoloogiad</a></li>
          <li v-if="language==='et'"><a href="#hobbies" v-smooth-scroll>Hobid</a></li>
          <li v-if="language==='et'"> <a href="#contact" v-smooth-scroll>Kontakt</a></li>

          <li v-if="language==='en'" class="active"  v-smooth-scroll><a href="#">Home</a></li>
          <li v-if="language==='en'"><a href="#completedCourses" v-smooth-scroll>Completed Courses</a></li>
          <li v-if="language==='en'"><a href="#studying" v-smooth-scroll>Currently Studying</a></li>
          <li v-if="language==='en'"><a href="#usedTech" v-smooth-scroll>Used Technologies</a></li>
          <li v-if="language==='en'"><a href="#hobbies" v-smooth-scroll>Hobbies</a></li>
          <li v-if="language==='en'"> <a href="#contact" v-smooth-scroll="{ duration: 1000, offset: -50 }">Contact</a></li>

        </ul>
        <ul class="nav navbar-nav navbar-right">
          <li><a> <img @click="changeLanguageEt()" src="https://cdn1.iconfinder.com/data/icons/european-country-flags/83/estonia-256.png" alt="Mountain View" style='height: 20px; width:20px; object-fit: contain'></a></li>
          <li><a><img  @click="changeLanguageEn()" src="https://cdn1.iconfinder.com/data/icons/world-flags-circular/1000/Flag_of_United_Kingdom_-_Circle-256.png" alt="Mountain View" style='height: 20px; width:20px; object-fit: contain'></a></li>
        </ul>
      </div><!--/.nav-collapse -->
    </div>
  </nav>
</template>

<script>

export default {
  name: 'navigation',

  mounted () {
  },
  computed: {
    language: function () {
      return this.$store.state.language
    }
  },

  methods: {
    changeLanguageEt () {
      this.$store.dispatch('setLanguage', 'et')
      this.$router.replace('/')
      this.$popup({
        message: 'Eesti keel',
        color: '#423452',
        backgroundColor: 'rgba(0, 0, 0, 0.95)',
        delay: 6
      })
    },

    changeLanguageEn () {
      this.$store.dispatch('setLanguage', 'en')
      this.$router.replace('/')
      this.$popup({
        message: 'English',
        color: '#423452',
        backgroundColor: 'rgba(0, 0, 0, 0.95)',
        delay: 6
      })
    }
  }
}
</script>

<style scoped lang='scss'>

</style>
