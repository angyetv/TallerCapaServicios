'use strict';

module.controller('MatriculaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.datosFormulario = {};
        $scope.panelEditar = false;
        $scope.listaEstudia = null;
        $scope.datosFormulario = {materiasList: []};

        $scope.matCarr = [];

        $scope.searchMat = function (data) {
            $scope.matCarr = [];
            for (var i = 0; i < $scope.materiasList.length; i++) {
                if ($scope.materiasList[i].carrera.nombre === data.nombre) {
                    $scope.matCarr.push($scope.materiasList[i]);
                }
            }
        };

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
            $scope.getMaterias();
            $scope.matCarr = [];
        };

//        $scope.guardar = function () {
//            $scope.errores = {};
//            var error = false;
//            if (error)
//                return;
//            if (!$scope.datosFormulario.id) {
//                $scope.datosFormulario.id = $scope.id++;
//                $scope.lista.push($scope.datosFormulario);
//            }
//            $scope.panelEditar = false;
//        };

        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
            $scope.matCarr = [];
        };

        $scope.eliminar = function (data) {
            for (var i = 0; i < $scope.lista.length; i++) {
                if ($scope.lista[i] === data) {
                    $scope.lista.splice(i, 1);
                    break;
                }
            }
            console.log("Eliminado " + data.nombre);
            $.ajax({
                url: './webresources/ServicioMatricula/' + data.nombre,
                type: 'DELETE'
            });
        };

        $scope.getMatricula = function () {
            $scope.lista = null;
            $http.get("./webresources/ServicioMatricula", {})
                    .then(function (response) {
                        console.log(response.data);
                        $scope.lista = response.data;
                    }, function () {
                        alert("Error al consultar el Matrucula");
                    });
        };

        $scope.getEstudiantes = function () {
            $http.get("./webresources/ServicioEstudiante", {})
                    .then(function (response) {
                        $scope.listaEstudia = response.data;
                        $scope.datosFormulario = {};
                    }, function () {
                        alert("Error al consultar el estudiante");
                    });
        };

        $scope.guardar = function () {
            $http.post("./webresources/ServicioMatricula", $scope.datosFormulario)
                    .then(function (response) {
                        $scope.getMatricula();
                    });
            $scope.panelEditar = false;
        };

        $scope.getMaterias = function () {
            $scope.lista = null;
            $http.get("./webresources/ServicioMateria", {})
                    .then(function (response) {
                        console.log(response.data);
                        $scope.materiasList = response.data;
                    }, function () {
                        alert("Error al consultar Materias");
                    });
        };

        $scope.getMatricula();
        $scope.getMaterias();
        $scope.getEstudiantes();
    }]);