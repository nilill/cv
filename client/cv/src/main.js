// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'
import {store} from './store/store'
import router from './router'
import './assets/css/globalStyle.scss'
import vueSmoothScroll from 'vue-smooth-scroll'
import VueUp from 'vueup'

Vue.use(VueUp)
Vue.use(vueSmoothScroll)
Vue.use(VueRouter)
Vue.config.productionTip = false
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>',
  store
})
