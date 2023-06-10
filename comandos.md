# Comandos Git

## Relacionados a GitHub

* `git remote add origin https://github.com/Colab-Place/ing_software_tp4`

Agrega un apuntador llamado "origin" para enviar/descargar los cambios hechos.

* `git pull origin main`

Descarga los cambios (commits) hechos en GitHub, basicamente actualiza tu repositorio local. **Siempre** hacerlo antes de empezar a tocar cambios para asegurarse que tenes la última versión del código.

* `git push origin nombre_branch`

Envía los cambios (commits) hechos a GitHub. Se manda la branch indicada, por ejemplo,  git push origin *add_checkout_unit_tests* manda la branch *add_checkout_unit_tests* a GitHub.

## Relacionados al Repositorio Local

* `git add nombre_archivo`

Añade un archivo/cambio hecho al Staging Area. Se debe hacer antes de realizar el commit.

* `git commit -m "Titulo del Commit"`

Crea un commit con todos los cambios que se encuentren en el Staging Area. El commit adquiere el nombre del titulo indicado (ver convenciones).


* `git checkout -b nombre_branch`

Crea una branch nueva sobre la branch donde te encuentres parado. Por ejemplo, si estoy en la branch main y corro `git checkout -b add_checkout_unit_tests` se me va a crear una branch llamada "*add_checkout_unit_tests*" que tendra los mismos commits que main (ya que ahi me encuentro parado), y podre utilizar esta branch para crear todos los cambios relacionados a los unit test del checkout (o cualquier otro proposito). Es importante que el nombre de la branch ayude a entender en que se trabajara (en este caso, los utests del checkout).

* `git checkout nombre_branch`

Se cambia a la branch nombre_branch.  Por ejemplo, si estoy en la branch "*add_checkout_unit_tests*" y quiero volver a la branch "main", puedo correr el comando `git checkout main`.