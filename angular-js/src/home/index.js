import angular from 'angular';

import HomeConfig from './home.config';
import HomeCtrl from './home.controller';

export default angular.module('home', [])
  .config(HomeConfig)
  .controller('HomeCtrl', HomeCtrl);