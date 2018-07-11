export default function HomeConfig($stateProvider) {
  'ngInject';

  $stateProvider.state('home', {
    url: '',
    controller: 'HomeCtrl',
    controllerAs: '$ctrl',
    templateUrl: 'home/home.html'
  });
};