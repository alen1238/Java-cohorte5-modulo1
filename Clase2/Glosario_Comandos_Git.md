
# Glosario de Comandos Git — Trabajo Colaborativo

Este glosario resume los comandos más utilizados durante el flujo de trabajo colaborativo con Git y GitHub.  
Cada comando incluye su descripción y el uso típico dentro del entorno de Visual Studio Code o la terminal.

---

## 1. `git --version`
**Descripción:** Verifica que Git esté instalado y muestra la versión.  
**Uso:** Confirmar que el entorno está listo antes de empezar a trabajar.

---

## 2. `git config --global user.name "Nombre"`  
**Descripción:** Configura el nombre del usuario que aparecerá en los commits.  
**Uso:** Asociar los cambios realizados con la identidad del colaborador.

---

## 3. `git config --global user.email "correo@ejemplo.com"`  
**Descripción:** Configura el correo electrónico asociado al usuario.  
**Uso:** Garantizar que los commits estén vinculados al perfil correcto de GitHub.

---

## 4. `git clone <URL-del-repositorio>`  
**Descripción:** Crea una copia local de un repositorio remoto.  
**Uso:** Descargar el proyecto base en la máquina local para empezar a trabajar.

---

## 5. `cd <nombre-carpeta>`  
**Descripción:** Entra en la carpeta del proyecto clonado.  
**Uso:** Posicionarse dentro del repositorio para ejecutar comandos Git.

---

## 6. `git remote -v`  
**Descripción:** Lista las URLs remotas asociadas al repositorio local.  
**Uso:** Confirmar la conexión con el repositorio remoto en GitHub.

---

## 7. `git branch`  
**Descripción:** Muestra las ramas locales disponibles.  
**Uso:** Verificar en qué rama se está trabajando actualmente.

---

## 8. `git branch -r`  
**Descripción:** Lista las ramas remotas existentes en GitHub.  
**Uso:** Verificar ramas creadas por otros colaboradores.

---

## 9. `git checkout -b <nombre-rama>`  
**Descripción:** Crea una nueva rama y cambia automáticamente a ella.  
**Uso:** Desarrollar nuevas funciones o correcciones sin afectar `main`.

---

## 10. `git status`  
**Descripción:** Muestra el estado actual del repositorio (archivos modificados, no rastreados, etc.).  
**Uso:** Revisar los cambios pendientes antes de hacer un commit.

---

## 11. `git add <archivo>`  
**Descripción:** Añade un archivo al área de *staging* (preparación para commit).  
**Uso:** Indicar qué archivos se incluirán en el próximo commit.

---

## 12. `git add .`  
**Descripción:** Añade todos los cambios del directorio actual al área de *staging*.  
**Uso:** Preparar todos los archivos modificados para el commit.

---

## 13. `git commit -m "mensaje"`  
**Descripción:** Guarda los cambios confirmados en el historial con un mensaje descriptivo.  
**Uso:** Registrar el progreso o modificaciones en el repositorio local.

---

## 14. `git push -u origin <nombre-rama>`  
**Descripción:** Envía la rama local al repositorio remoto en GitHub.  
**Uso:** Publicar el trabajo para que otros colaboradores lo vean o revisen.

---

## 15. `git pull origin main`  
**Descripción:** Descarga y fusiona los cambios de la rama `main` remota en la copia local.  
**Uso:** Mantener el repositorio local sincronizado con la versión más reciente del remoto.

---

## 16. `git merge main`  
**Descripción:** Fusiona los cambios de `main` en la rama actual.  
**Uso:** Actualizar tu rama con la última versión de `main` antes de hacer un pull request.

---

## 17. `git log --oneline --graph`  
**Descripción:** Muestra el historial de commits de forma resumida y visual.  
**Uso:** Comprender la estructura de las ramas y el flujo de commits.

---

## 18. `git branch -d <nombre-rama>`  
**Descripción:** Elimina una rama local ya fusionada.  
**Uso:** Limpiar ramas que ya no son necesarias después de un merge.

---

## 19. `git push origin --delete <nombre-rama>`  
**Descripción:** Elimina una rama remota del repositorio en GitHub.  
**Uso:** Mantener el repositorio remoto ordenado eliminando ramas antiguas.

---

## 20. `git status` (repetido intencionalmente)  
**Descripción:** Es el comando más utilizado; su función de verificar el estado actual es clave en cada paso.  
**Uso:** Antes y después de cada acción, ejecutar para confirmar el estado.

