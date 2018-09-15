'use strict';

module.controller('FacultadCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.id = 3;

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

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;
            if (error)
                return;
            if (!$scope.datosFormulario.id) {
                $http.post("./webresources/ServicioFacultad", $scope.nuevoFacultad)
                        .then(function (response) {
                            $scope.getFacultad();
                        });
                $http;
            }
            $scope.panelEditar = false;
        };
    }]);
