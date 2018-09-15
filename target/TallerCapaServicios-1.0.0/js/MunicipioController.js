'use strict';

module.controller('MunicipioCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        $scope.lista = null;
        $scope.datosFormulario = {};
        $scope.panelEditar = false;

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

        $scope.getMunicipios = function () {
            $http.get("./webresources/ServicioMunicipio", {})
                    .then(function (response) {
                        $scope.lista = response.data;
                    }, function () {
                        alert("Error al consultar el Municipios");
                    });
        };

        $scope.guardarMunicipio = function () {
            $http.post("./webresources/ServicioMunicipio", $scope.nuevoMunicipio)
                    .then(function (response) {
                        $scope.getMunicipios();
                    });
        }

        $scope.guardar = function () {
            $scope.lista.push($scope.datosFormulario);
            $scope.panelEditar = false;
        };
        $scope.getMunicipios();
    }]);
