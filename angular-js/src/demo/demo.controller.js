export default class DemoCtrl {
  constructor($scope, $stateParams) {
    'ngInject';

    this.name = 'Demo';
    this.params = $stateParams || {}
  }
}