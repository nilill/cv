<template>
  <div>
    <header id="home">

      <div class="home-wrapper">
        <div class="container margins">
          <div class="row">
            <div class="col-md-10 col-md-offset-1">
              <div class="home-content">
                <h1 class="white-text cursive">Nils-Emil Lille</h1>
                <p v-if="language==='en'" class="white-text">I am a second year Informatics student who has completed the military service. My purpose is to find a company that works on large scale applications where I can be a full stack developer. My native language is Estonian but I am fluent in English as well.

                </p>
                <p v-if="language==='et'" class="white-text">Olen 2. aasta informaatika tudeng, kes on 21-aastane ja on ajateenistuse läbinud. Minu eesmärk oleks leida firma, mis arendab suuremõõtmelisi rakendusi, kus ma saaksin töötada full stack arendajana. Emakeeleks on eesti keel, kuid räägin soravat inglise keelt.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>

    <completed-courses id="completedCourses" style="z-index: 2"/>
  </div>
</template>

<script>

import CompletedCourses from './CompletedCourses'

export default {

  components: {CompletedCourses},
  name: 'about',
  data () {
    return {
    }
  },
  computed: {
    language: function () {
      return this.$store.state.language
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

  h1, h2 {
    font-weight: normal;
  }
  ul {
    list-style-type: none;
    padding: 0;
  }
  li {
    display: inline-block;
    margin: 0 10px;
  }
  a {
    color: #42b983;
  }
</style>
