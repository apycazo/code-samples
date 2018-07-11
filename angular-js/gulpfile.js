var gulp = require('gulp'),
    
    del = require('del'),
    sass = require('gulp-sass'),
    rename = require('gulp-rename'),
    sourcemaps = require('gulp-sourcemaps')
    ;

var paths= {
    styles: './src/styles/*',
    dist: './dist/',
    maps: './maps'
}

gulp.task('clean', function (cb) {
    del(paths.dist, cb);
});    

gulp.task('build-sass', [], function () {
    return gulp
        .src(paths.styles)
        .pipe(sass())
        .pipe(rename('styles.css'))
        .pipe(gulp.dest(paths.dist));
});

gulp.task('build', ['clean', 'build-sass']);