'use strict';

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.id = 3;

        $scope.listaCarrera = listaCarreras;
        $scope.listaProfes = listaProfes;

        $scope.datosFormulario = {horario: []};
        $scope.panelEditar = false;



        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            //$scope.datosFormulario = {horario:[]};
        };


        $scope.nuevoHorario = function () {
            $scope.datosHorario = {};
            $('#modalHorario').modal('show');
        }

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;

            if (error)
                return;

            if (!$scope.datosFormulario.id) {
                $scope.datosFormulario.id = $scope.id++;
                $scope.lista.push($scope.datosFormulario);
            }
            $scope.panelEditar = false;
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

        $scope.guardarHorario = function () {
            $scope.datosFormulario.horario.push($scope.datosHorario);
            $('#modalHorario').modal('hide');
        }
    }]);



