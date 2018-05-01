<template>

  <div id="service" class="section md-padding">
    <div class="container margins">
      <div class="row">
        <div class="section-header text-center">
          <h2 style="margin-bottom: 100px" class="title cursive">{{howPageWasMade}}</h2>
          <p v-if="language==='en'" class="white-text">This page was made with Vue.js that takes most of the displayed data from Spring Boot REST API that runs on Amazon Web Service. The Spring application uses a H2 in memory database. All of the pictures were taken from pixabay.com.
          </p>
          <p v-if="language==='et'" class="white-text">See leht on tehtud kasutades Vue.js raamistiku. Enamus kuvatud infot on võetud Spring Boot REST API-st, mis jookseb Amazon Web Serviceis. Springi rakendus kasutab H2 mälupõhist andmebaasi. Kõik pildid on võetud pixabay.com lehelt.
          </p>
        </div>
        <div class="section-header text-center">
          <h2 style="margin-top: 200px" class="title cursive">{{contact}}</h2>
         Email: nilsemil.lille@gmail.com<br>
          Tel: +372 5361 6264<br>
          Instagram: <a style="color: wheat" href="https://www.instagram.com/nils_emil_lille/">nils_emil_lille</a><br/>
          Github: <a style="color: wheat" href="https://github.com/nilill">nilill</a>
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
      howPageWasMade: '',
      contact: 'Welcome to Your Vue.js App',
      itemsPerRow: 3,
      data: []
    }
  },
  created: function () {
    axios.get('/ongoing/' + this.language).then(response => {
      this.courses = response.data
    })
    axios.get('/titles/' + this.language).then(response => {
      this.howPageWasMade = response.data.howPageWasMade
      this.contact = response.data.contact
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
      })
      axios.get('/titles/' + this.language).then(response => {
        this.howPageWasMade = response.data.howPageWasMade
        this.contact = response.data.contact
      })
    }
  }
}
</script>
<style scoped>
</style>
