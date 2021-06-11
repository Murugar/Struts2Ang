(function() {
    'use strict';

    angular
        .module('app')
        .controller('ApacheProjectsController', ApacheProjectsController);

    function ApacheProjectsController($log, DataService) {
        var vm = this;

        init();

        function init() {
            return DataService.getProjects().then(function(data) {
                vm.projects = data.projectNames;
                return vm.projects;
            }, function() {
                $log.error('Could not receive project names.');
            });
        }
    }
})();