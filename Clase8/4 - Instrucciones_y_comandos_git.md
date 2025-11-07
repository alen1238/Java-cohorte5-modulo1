# Guía de Comandos Git para Iniciar y Subir un Proyecto a GitHub

## 1. Inicializar el repositorio local

```bash
git init
```
Crea un nuevo repositorio Git en la carpeta actual.

---

## 2. Configurar tu identidad (solo la primera vez)

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@example.com"
```
Establece quién realiza los commits (solo se hace una vez por equipo).

---

## 3. Verificar el estado del repositorio

```bash
git status
```
Muestra qué archivos han sido modificados o agregados.

---

## 4. Agregar archivos al área de preparación

```bash
git add .
```
Agrega todos los archivos del proyecto para incluirlos en el próximo commit.  
(Puedes agregar archivos específicos: `git add archivo.java`)

---

## 5. Crear el primer commit

```bash
git commit -m "Primer commit: estructura inicial del proyecto"
```
Guarda un punto de control con los cambios preparados.

---

## 6. Crear el repositorio remoto en GitHub

Desde tu cuenta de GitHub:

Crea un nuevo repositorio (sin README ni .gitignore si ya tienes archivos locales).  
Ejemplo: `https://github.com/usuario/mi-proyecto.git`

---

## 7. Vincular el repositorio local con el remoto

```bash
git remote add origin https://github.com/usuario/mi-proyecto.git
```
Conecta tu proyecto local con el repositorio remoto en GitHub.

Puedes verificar la conexión con:

```bash
git remote -v
```

---

## 8. Subir los cambios al repositorio remoto

```bash
git push -u origin main
```
Sube tu rama principal (main) al repositorio remoto y establece el seguimiento entre ambas.

Si tu rama se llama `master`, usa:

```bash
git push -u origin master
```

---

## 9. Hacer cambios futuros y subirlos

Cada vez que hagas modificaciones:

```bash
git add .
git commit -m "Descripción de los cambios realizados"
git push
```

---

## 10. Traer cambios del repositorio remoto (si trabajas en equipo)

```bash
git pull
```
Descarga y fusiona los cambios que otros colaboradores hayan subido.

---

## Resumen Rápido

| Etapa | Comando | Descripción |
|-------|----------|--------------|
| Iniciar repo local | `git init` | Crea el repositorio |
| Configurar usuario | `git config --global user.name` / `git config --global user.email` | Define tu identidad |
| Ver estado | `git status` | Muestra cambios pendientes |
| Agregar archivos | `git add .` | Prepara cambios |
| Crear commit | `git commit -m "mensaje"` | Guarda cambios |
| Conectar con GitHub | `git remote add origin URL` | Vincula remoto |
| Subir cambios | `git push -u origin main` | Sube a GitHub |
| Actualizar local | `git pull` | Sincroniza con remoto |
