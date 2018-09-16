'use strict';

module.controller('EstudiantesCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.listaMunicipio = null;
        $scope.listaCarrera = null;

        $scope.datosFormulario = {};
        $scope.panelEditar = false;

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
        };

        //editar
        $scope.editar = function (data) {
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                for (var i = 0; i < $scope.lista.length; i++) {
                    if ($scope.lista[i] == data) {
                        $scope.lista.splice(i, 1);
                        break;
                    }
                }
            }
        };

        $scope.getEstudiantes = function () {
            $http.get("./webresources/ServicioEstudiante", {})
                    .then(function (response) {
                        $scope.lista = response.data;
                        $scope.datosFormulario = {};
                    }, function () {
                        alert("Error al consultar el estudiante");
                    });
        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;
            if (error)
                return;
            if (!$scope.datosFormulario.id) {
                $http.post("./webresources/ServicioEstudiante", $scope.nuevoEstudiante)
                        .then(function (response) {
                            $scope.getEstudiantes();
                        });
                $http;
            }
            $scope.panelEditar = false;
        };
        
        $scope.getEstudiantes();
    }]);
