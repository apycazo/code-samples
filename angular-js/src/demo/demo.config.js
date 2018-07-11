export default function DemoConfig($stateProvider) {
  'ngInject';

  $stateProvider.state('demo', {
    url: '/demo/:id',
    controller: 'DemoCtrl',
    controllerAs: '$ctrl',
    templateUrl: 'demo/demo.html'
  });
};