'use strict';

module.controller('MateriaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = null;
        $scope.listaCarrera = null;
        $scope.listaProfes = null;

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
            for (var i = 0; i < $scope.lista.length; i++) {
                if ($scope.lista[i] === data) {
                    $scope.lista.splice(i, 1);
                    break;
                }
            }
            console.log("Eliminado " + data.nombre);
            $.ajax({
                url: './webresources/ServicioMateria/' + data.id,
                type: 'DELETE'
            });
        };

        $scope.getMaterias = function () {
            $scope.lista = null;
            $http.get("./webresources/ServicioMateria", {})
                    .then(function (response) {
                        console.log(response.data);
                        $scope.lista = response.data;
                    }, function () {
                        alert("Error al consultar Materias");
                    });
        };

        $scope.guardarMateria = function () {
            $http.post("./webresources/ServicioMateria", $scope.datosFormulario)
                    .then(function (response) {
                        $scope.getMaterias();
                    });
            $scope.panelEditar = false;
        };
        
        $scope.getCarrera = function () {
            $scope.lista = null;
            $http.get("./webresources/ServicioCarrera", {})
                    .then(function (response) {
                        $scope.listaCarrera = response.data;
                    }, function () {
                        alert("Error al consultar el Carreras");
                    });
        };
        
        $scope.getProfesores = function () {
            $scope.lista = null;
            $http.get("./webresources/ServicioProfesor", {})
                    .then(function (response) {
                        console.log('profesores: '+response.data);
                        $scope.listaProfes = response.data;
                    }, function () {
                        alert("Error al consultar el Profesores");
                    });
        };
        
        $scope.getProfesores();
        $scope.getCarrera();
        $scope.getMaterias();
    }]);



