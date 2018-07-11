import angular from 'angular';

import DemoConfig from './demo.config';
import DemoCtrl from './demo.controller';

export default angular.module('demo', [])
  .config(DemoConfig)
  .controller('DemoCtrl', DemoCtrl);