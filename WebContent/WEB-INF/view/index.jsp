<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE >
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Lumino - Dashboard</title>
	
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/datepicker3.css" rel="stylesheet">
	<link href="css/styles.css" rel="stylesheet">
	
	<!--Icons-->
	<script src="js/lumino.glyphs.js"></script>
	<script type="text/javascript">
		function confirmer(url) {
			var rep = confirm("Etes vous sur de vouloir supprimer");
			if (rep == true) {
				document.location = url;
			}
		}
	</script>
	
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-6">
				<c:if test="${ok == 0}">
					<div class="alert alert-danger alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-cancel"></use>
						</svg>
					    <strong>Erreur!</strong> operation no reussi
				    </div>
				</c:if>
				<c:if test="${ok == 1}">
					<div class="alert alert-success alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-checkmark"></use>
						</svg>
					    <strong>Success!</strong> le responsable est bien enregistrer
				  </div>
				</c:if>
				<c:if test="${ok == 2}">
					<div class="alert alert-success alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-checkmark"></use>
						</svg>
					    <strong>Modifier!</strong> le responsable a ete modifier
				  </div>
				</c:if>
				<c:if test="${ok == 3}">
					<div class="alert alert-success alert-dismissible">
					    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
					    <svg class="glyph stroked checkmark">
							<use xlink:href="#stroked-checkmark"></use>
						</svg>
					    <strong>Supprimer!</strong> le responsable a ete supprimer
				  </div>
				</c:if>
				<div class="panel panel-default">
					<div class="panel-heading">AJOUTER UN RESPONSABLE DE CLASSE</div>
					<div class="panel-body">
						<form action="responsable" method="POST">
							<input type="hidden" name="action" value="add">
							<input type="hidden" name="mode" value="${mode}">
							<input type="hidden" name="code" value="${responsable.code}">
							<div class="form-group">
								<label>Prenom</label>
								<input name="prenom" class="form-control" placeholder="donner le prenom" value="${responsable.prenom}">
							</div>
							<div class="form-group">
								<label>Nom</label>
								<input name="nom" class="form-control" placeholder="donner le nom" value="${responsable.nom}">
							</div>	
							<div class="form-group">
								<label>Login</label>
								<input name="login" class="form-control" placeholder="donner le login" value="${responsable.login}">
							</div>										
							<div class="form-group">
								<label>Mot de pass</label>
								<input type="password" name="password" class="form-control" placeholder="donner le password" value="${responsable.password}">
							</div>
							<button type="submit" class="btn btn-primary">
								<span class="glyphicon glyphicon-check"></span> ajouter
							</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="panel panel-default">
					<div class="panel-heading">
						<input id="search" class="form-control pull-right" placeholder="rechercher par nom, prenom, login..." style="width: 300px" >
					</div>
					<div class="panel-body">
						<table class="table" data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        <th >PRENOMN</th>
						        <th >NOM</th>
						        <th >LOGIN</th>
						        <th >PASSWORD</th>
						        <th colspan="2" style="text-shadow: 1px 1px 2px #71d1eb;text-align: center;">ACTION</th>    
						    </tr>
						    </thead>
							<tbody>
							<c:forEach items="${listeResponsables}" var="l">
								<tr>
									<td>${l.prenom}</td>
									<td>${l.nom}</td>
									<td>${l.login}</td>
									<td>${l.password}</td>
									<td><a href="responsable?action=update&code=${l.code }">Modifier</a></td>
									<td><a href="javascript:confirmer('responsable?action=delete&code=${l.code }')">Supprimer</a></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->
	</div>
	
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- <script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script> -->
	<script src="js/bootstrap-datepicker.js"></script>
	<style type="text/css">
	    table.table tbody tr:hover {
	   		background-color:#71d1eb !important;
		}
	</style>
	<script type="text/javascript">
		$("#search").keyup(function () {
		    var value = this.value.toLowerCase().trim();
	
		    $("table tr").each(function (index) {
		        if (!index) return;
		        $(this).find("td").each(function () {
		            var id = $(this).text().toLowerCase().trim();
		            var not_found = (id.indexOf(value) == -1);
		            $(this).closest('tr').toggle(!not_found);
		            return not_found;
		        });
		    });
		});
	</script>
</body>
</html>